import React, { useState } from 'react';
import { useNavigate, Link } from 'react-router-dom';
import './Login.css'

function Login(){

    const navigate = useNavigate();

    const handleClick = () => {
      navigate('/');
    };


    return(
        <form className='formContainer'>
            <div className='input'>
                <label for='emailInput'>Email</label>
                <p></p>
                <input type='text' name='emailInput' placeholder='Email' required />
            </div>
            <div className='input'>
                <label for='passwordInput'>Password</label>
                <p></p>
                <input type='text' name='passwordInput' placeholder='Password' required/>
            </div>
            <button placeholder='Submit it' className='btn' onClick={handleClick}> Submit it</button>
        </form>
    );
}

export default Login