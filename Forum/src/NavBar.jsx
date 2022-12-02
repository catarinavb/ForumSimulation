import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import { BiUser } from 'react-icons/bi';
import './NavBar.css'



function NavBar() {

  return (
    <div className='list'>
      
        <h1>
            Forum
        </h1>
   
     
        <Link to='login' className='link'>
            <div>
            <BiUser />
            Login
            </div>
        </Link>
    </div>
  );
}

export default NavBar;
