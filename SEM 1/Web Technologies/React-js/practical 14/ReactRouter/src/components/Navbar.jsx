import React from 'react'
import { NavLink } from 'react-router-dom'

function Navbar() {
    return (
        <nav className="bg-blue-600 p-4 text-white flex gap-6">
            <NavLink to="/" className="hover:underline">
                Home
            </NavLink>
            <NavLink to="/about" className="hover:underline">
                About
            </NavLink>
            <NavLink to="/contact" className="hover:underline">
                Contact
            </NavLink>
        </nav>
    )
}

export default Navbar