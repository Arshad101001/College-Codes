import { useState } from 'react'
import { StrictMode } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import  LifeCycleDemo from "./components/LifeCycleDemo";

function App() {
  const [count, setCount] = useState(0)

  return (
    <>

      <h1>Hello world!!</h1>
      <LifeCycleDemo />
    </>
  )
}

export default App
