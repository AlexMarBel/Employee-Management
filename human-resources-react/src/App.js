import { BrowserRouter, Route, Routes } from "react-router-dom";
import EmployeeList from "./employees/EmployeeList";
import Navigation from "./templates/Navigation";
import AddEmployee from "./employees/AddEmployee";
import EditEmployee from "./employees/EditEmployee";

function App() {
  return (
    <div className="container">
      <BrowserRouter>
      <Navigation/>
      <Routes>
        <Route exact path='/' element={<EmployeeList/>}/>
        <Route exact path='/add' element={<AddEmployee/>}/>
        <Route exact path='/edit/:id' element={<EditEmployee/>}/>
      </Routes>
      </BrowserRouter>
    </div>
    
  );
}

export default App;
