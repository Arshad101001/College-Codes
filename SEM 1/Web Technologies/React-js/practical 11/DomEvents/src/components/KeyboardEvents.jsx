import { useState } from "react";

const KeyboardEvents = () => {
  const [key, setKey] = useState("");

  return (
    <div className="bg-white p-6 rounded-lg shadow">
      <h2 className="text-2xl font-semibold mb-4">Keyboard Events</h2>

      <input
        type="text"
        placeholder="Type something..."
        className="border p-2 w-full rounded"
        onKeyDown={(e) => setKey(`Key Down: ${e.key}`)}
        onKeyUp={(e) => setKey(`Key Up: ${e.key}`)}
      />

      <p className="mt-4 font-medium text-gray-700">
        Event Output: <span className="text-green-600">{key}</span>
      </p>
    </div>
  );
};

export default KeyboardEvents;
