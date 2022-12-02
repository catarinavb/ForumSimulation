import React, { useState } from 'react'
import styled from 'styled-components'
import Thread from './Thread'

const HomePageContainer = styled.main`
    background-color: aqua;
`

function HomePage() {

    const [title, setTitle] = useState(false);

  return (
    <HomePageContainer>
        <Thread />
    </HomePageContainer>
  );
}


export default HomePage;
