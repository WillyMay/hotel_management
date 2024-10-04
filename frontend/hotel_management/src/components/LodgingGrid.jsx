import React from 'react'
import LodgingDetails from './LodgingDetails'

function LodgingGrid({lodgings}) {
  return (
<div className="flex flex-col">
      <div className="overflow-x-auto sm:-mx-6 lg:-mx-8">
        <div className="inline-block min-w-full py-2 sm:px-6 lg:px-8">
          <div className="overflow-hidden">
            <table className="min-w-full text-left text-sm font-light">
              <thead className="border-b font-medium dark:border-neutral-500">
                <tr>
                  <th scope="col" className="px-6 py-4">id</th>
                  <th scope="col" className="px-6 py-4">Guest</th>
                  <th scope="col" className="px-6 py-4">Companions</th>
                  <th scope="col" className="px-6 py-4">Room</th>
                  <th scope="col" className="px-6 py-4">Check-in</th>
                  <th scope="col" className="px-6 py-4">Check-out</th>
                  <th scope="col" className="px-6 py-4">Amount</th>
                  <th scope="col" className="px-6 py-4">Balance</th>
                  <th scope="col" className="px-6 py-4">Comments</th>
                  <th scope="col" className="px-6 py-4">Edit</th>
                </tr>
              </thead>
              <tbody>
                {lodgings?.map((lodging) => (
                    <LodgingDetails details={lodging} key={lodging.id}/>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  )
}

export default LodgingGrid