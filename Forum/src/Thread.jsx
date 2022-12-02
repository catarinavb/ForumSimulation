import React, { useEffect, useState } from 'react'
import './Thread.css'
import Title from './Title'
import Body from './Body'


function Thread(){
    const[selected, setSelected] = useState();
    const[visibleTitle, setVisibleTitle] = useState(false);
    const[title, setTitle] = useState("");
    const[visibleBody, setVisibleBody] = useState(false);

    const handleChange = event => {
        setSelected(event.target.value);
        setVisibleTitle(true);
    }

    const getTitleChild = event => {
        setTitle(event.target.value);
        setVisibleBody(true);
    }


    return(
        <div className='threadContainer'>

            {/* Get Thread */}
            <select
            className='selector'
            value={selected}
            placeHolder='Select your thread'
            onChange={handleChange}
            required
            >
                <option>--Select the thread--</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
            </select>
            
            {/* Get Tittle */}
            {/*{ this.state.visibleTitle ? <Title passTitleChild={getTitleChild} thread={selected} /> : null }*/}


            {/* Get Body */}
            {/*{this.state.visibleBody ? <Body thread={selected} /> : null }*/}
            
        </div>
    )
}

export default Thread