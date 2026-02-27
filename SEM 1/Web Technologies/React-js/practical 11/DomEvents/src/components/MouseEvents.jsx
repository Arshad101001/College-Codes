import { useState } from "react";

const MouseEvents = () => {
  const [message, setMessage] = useState("No mouse event yet");

  return (
    <div className="bg-white p-6 rounded-lg shadow">
      <h2 className="text-2xl font-semibold mb-4">Mouse Events</h2>

      <button
        className="bg-blue-500 text-white px-4 py-2 rounded mr-2"
        onClick={() => setMessage("Button Clicked")}
      >
        Click
      </button>

      <button
        className="bg-green-500 text-white px-4 py-2 rounded mr-2"
        onDoubleClick={() => setMessage("Button Double Clicked")}
      >
        Double Click
      </button>

      <div
        className="mt-4 p-4 bg-gray-200 rounded text-center"
        onMouseEnter={() => setMessage("Mouse Entered the Box")}
        onMouseLeave={() => setMessage("Mouse Left the Box")}
      >
        Hover Over Me
      </div>

      <p className="mt-4 font-medium text-gray-700">
        Event Output: <span className="text-blue-600">{message}</span>
      </p>
    </div>
  );
};

export default MouseEvents;
