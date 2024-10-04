import axios from "axios";

const initLodging = [
    {
        id: 1,
        amount_guests: 2,
        checkIn: "2024-01-01",
        checkOut: "2024-01-03",
        room: "102",
        guest: {
            id: 1,
            firstName: "Willian",
            lastName: "Mayer",
            idCountry: "12345",
            country: "Venezuela",
            address: "Mendoza 123",
            email: "willian@gmail.com",
            phoneNumber: "1234567"
        },
        comments: "Nothing",
        amount: 7000,
        balance: 0
    }   
]

export const listLogding = () => {
    return initLodging;
}

//Receiving external API
const baseUrl = 'http://localhost:8080/api/lodging';

export const findAll = async () => {
    try {
        const response = await axios.get(baseUrl);
        console.log(response.data)
        return response;
    } catch (error) {
        console.log(error)
    }

    return null;
}
