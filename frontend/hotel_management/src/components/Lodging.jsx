import React from 'react'
import LodgingGrid from './LodgingGrid'

function Lodging({reservations}) {
  return (
    <div>
        <h1 className='text-3xl font-bold p-4'>Lodging List</h1>
        <LodgingGrid lodgings={reservations}/>
    </div>
  )
}

export default Lodging