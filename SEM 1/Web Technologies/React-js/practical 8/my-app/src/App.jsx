import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HelloWorld from './component/HelloWorld'
import Life from './component/Life'
import MyclassComponent from './component/MyClassComponent'

function App() {

  return (
    <>
      <HelloWorld />
      <Life />
      <MyclassComponent />
    </>
  )
}

export default App
