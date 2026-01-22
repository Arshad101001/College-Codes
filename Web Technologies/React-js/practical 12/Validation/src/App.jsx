import { useState } from 'react'
import './App.css'

function App() {

  const [formData, setFormData] = useState({
    name: "",
    email: "",
    password: "",
  });

  const [errors, setErrors] = useState({});
  const [serverError, setServerError] = useState("");
  const [success, setSuccess] = useState("");

  // Client-side validation
  const validateClient = () => {
    const newErrors = {};

    if (!formData.name.trim()) {
      newErrors.name = "Name is required";
    }

    if (!formData.email) {
      newErrors.email = "Email is required";
    } else if (!/\S+@\S+\.\S+/.test(formData.email)) {
      newErrors.email = "Invalid email format";
    }

    if (!formData.password) {
      newErrors.password = "Password is required";
    } else if (formData.password.length < 6) {
      newErrors.password = "Password must be at least 6 characters";
    }

    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  // Simulated server-side validation
  const fakeServerValidation = async () => {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        if (formData.email === "test@example.com") {
          reject({ message: "Email already exists" });
        } else if (formData.password === "123456") {
          reject({ message: "Password is too weak" });
        } else {
          resolve({ message: "Registration successful" });
        }
      }, 1000);
    });
  };

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
    setErrors({});
    setServerError("");
    setSuccess("");
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    if (!validateClient()) return;

    try {
      const response = await fakeServerValidation();
      setSuccess(response.message);
      setFormData({ name: "", email: "", password: "" });
    } catch (error) {
      setServerError(error.message);
    }
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gray-700">
      <form
        onSubmit={handleSubmit}
        className="bg-gray-300 p-6 rounded-xl shadow-md w-96 space-y-4"
      >
        <h2 className="text-xl font-bold text-center">Register</h2>

        {serverError && (
          <p className="text-red-600 text-sm text-center">{serverError}</p>
        )}
        {success && (
          <p className="text-green-600 text-sm text-center">{success}</p>
        )}

        {/* Name */}
        <div>
          <input
            type="text"
            name="name"
            placeholder="Name"
            value={formData.name}
            onChange={handleChange}
            className="w-full border p-2 rounded"
          />
          {errors.name && (
            <p className="text-red-500 text-sm">{errors.name}</p>
          )}
        </div>

        {/* Email */}
        <div>
          <input
            type="email"
            name="email"
            placeholder="Email"
            value={formData.email}
            onChange={handleChange}
            className="w-full border p-2 rounded"
          />
          {errors.email && (
            <p className="text-red-500 text-sm">{errors.email}</p>
          )}
        </div>

        {/* Password */}
        <div>
          <input
            type="password"
            name="password"
            placeholder="Password"
            value={formData.password}
            onChange={handleChange}
            className="w-full border p-2 rounded"
          />
          {errors.password && (
            <p className="text-red-500 text-sm">{errors.password}</p>
          )}
        </div>

        <button
          type="submit"
          className="w-full bg-blue-600 text-white py-2 rounded hover:bg-blue-700"
        >
          Submit
        </button>
      </form>
    </div>
  );
}

export default App