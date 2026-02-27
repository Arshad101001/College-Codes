import { useState } from 'react'
import './App.css'
import MouseEvents from './components/MouseEvents'
import KeyboardEvents from './components/KeyboardEvents'

function App() {
  const [count, setCount] = useState(0)

    return (
    <div className="min-h-screen bg-gray-100 p-6">
      <h1 className="text-4xl font-bold text-center mb-8">
        React DOM Events Demo
      </h1>

      <div className="grid md:grid-cols-2 gap-6">
        <MouseEvents />
        <KeyboardEvents />
      </div>
    </div>
  );
}

export default App
