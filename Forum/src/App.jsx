import { useState } from 'react'
import { Route, Routes } from 'react-router-dom'
import HomePage from './HomePage'
import NotFound from './NotFound'
import NavBar from './NavBar'
import Login from './Login'


function App() {
  const [token, setToken] = useState(0)


  return (
    <div className="App">
      <NavBar />
      <Routes>
        <Route path="/" element={<HomePage />} /> 
        <Route path="/login" element={<Login />} /> 
        <Route path="*" element={<NotFound />} /> 
      </Routes>
    </div>
  )
}

export default App


/*function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src="/vite.svg" className="logo" alt="Vite logo" />
        </a>
        <a href="https://reactjs.org" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </div>
  )
}

export default App*/
