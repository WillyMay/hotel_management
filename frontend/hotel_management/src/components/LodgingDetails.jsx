import React from 'react'

function LodgingDetails({details}) {
  return (
    <tr className="border-b transition duration-300 ease-in-out hover:bg-neutral-100 dark:border-neutral-500 dark:hover:bg-neutral-600">
        <td className="whitespace-nowrap px-6 py-4 font-medium">{details.id}</td>
        <td className="whitespace-nowrap px-6 py-4">{details.guest.lastName}, {details.guest.firstName}</td>
        <td className="whitespace-nowrap px-6 py-4">{details.amountGuests}</td>
        <td className="whitespace-nowrap px-6 py-4">{details.room}</td>
        <td className="whitespace-nowrap px-6 py-4">{details.checkIn}</td>
        <td className="whitespace-nowrap px-6 py-4">{details.checkOut}</td>
        <td className="whitespace-nowrap px-6 py-4 font-medium">${details.amount}</td>
        <td className="whitespace-nowrap px-6 py-4 font-medium">${details.balance}</td>
        <td className="whitespace-nowrap px-6 py-4">{details.comments}</td>
        <td className='btn btn-primary align-center'>Editar</td>
  </tr>
  )
}

export default LodgingDetails