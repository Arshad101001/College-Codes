import './App.css';
import { useState, useEffect, useRef, useMemo, useCallback, createContext, useContext } from "react";

// Context
const ThemeContext = createContext();

export default function App() {
  const [theme, setTheme] = useState("light");

  return (
    <ThemeContext.Provider value={{ theme, setTheme }}>
      <Main />
    </ThemeContext.Provider>
  );
}

function Main() {
  const { theme, setTheme } = useContext(ThemeContext);

  const [count, setCount] = useState(0);
  const [number, setNumber] = useState(5);
  const inputRef = useRef(null);

  // useEffect
  useEffect(() => {
    document.title = `Count: ${count}`;
  }, [count]);

  // useMemo (expensive calculation)
  const factorial = useMemo(() => {
    const calcFactorial = (n) => {
      let result = 1;
      for (let i = 1; i <= n; i++) result *= i;
      return result;
    };
    return calcFactorial(number);
  }, [number]);

  // useCallback
  const focusInput = useCallback(() => {
    inputRef.current.focus();
  }, []);

  return (
    <div
      className={`min-h-screen flex items-center justify-center ${theme === "light" ? "bg-gray-100" : "bg-gray-900"
        }`}
    >
      <div
        className={`p-6 rounded-xl shadow-lg w-96 space-y-4 ${theme === "light" ? "bg-white" : "bg-gray-800 text-white"
          }`}
      >
        <h1 className="text-xl font-bold text-center">React Hooks Demo</h1>

        {/* useState */}
        <div className="text-center">
          <p>Count: {count}</p>
          <button
            onClick={() => setCount(count + 1)}
            className="bg-blue-600 text-white px-4 py-1 rounded"
          >
            Increment
          </button>
        </div>

        {/* useRef */}
        <div>
          <input
            ref={inputRef}
            placeholder="Focus me"
            className="w-full p-2 border rounded text-black"
          />
          <button
            onClick={focusInput}
            className="mt-2 bg-green-600 text-white px-4 py-1 rounded"
          >
            Focus Input
          </button>
        </div>

        {/* useMemo */}
        <div className="text-center">
          <input
            type="number"
            value={number}
            onChange={(e) => setNumber(Number(e.target.value))}
            className="w-full p-2 border rounded text-black"
          />
          <p className="mt-2">Factorial: {factorial}</p>
        </div>

        {/* useContext */}
        <button
          onClick={() => setTheme(theme === "light" ? "dark" : "light")}
          className="w-full bg-purple-600 text-white py-2 rounded"
        >
          Toggle Theme
        </button>
      </div>
    </div>
  );
}
