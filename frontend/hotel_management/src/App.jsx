import { Suspense, useState } from "react";
import { fetchData } from "./services/FetchData.js";
import Lodging from "./components/Lodging.jsx";

const apiData = fetchData("http://localhost:8080/api/lodging");
function App() {
  const data = apiData.read();
  return (
    <>
      <Suspense callback={<div>Loading...</div>}>
        <Lodging reservations={data} />
        {console.log(data)}
      </Suspense>
    </>
  );
}

export default App;
