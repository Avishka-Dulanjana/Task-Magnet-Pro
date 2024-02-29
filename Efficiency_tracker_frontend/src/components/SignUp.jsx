import { Link, useNavigate } from "react-router-dom";


const SignUp = () => {
  
  const navigate = useNavigate();
  

  const register = () => {
    
      
  };
  return (
    <div className="bg-gray-10 ">
      <div className="flex justify-center h-screen w-screen items-center">
        <div className="w-full md:w-1/2 flex flex-col items-center ">
          <h1 className="text-center text-2xl font-bold text-gray-600 mb-6">
            SIGNUP
          </h1>
          <div className="w-3/4 mb-6">
            <input
              type="text"
              name="name"
              id="name"
              className="w-full py-4 px-8 bg-slate-200 placeholder:font-semibold rounded hover:ring-1 outline-blue-500"
              placeholder="User Name"
              
            />
          </div>
          <div className="w-3/4 mb-6">
            <input
              type="email"
              name="email"
              id="email"
              className="w-full py-4 px-8 bg-slate-200 placeholder:font-semibold rounded hover:ring-1 outline-blue-500"
              placeholder="Email"
              
            />
          </div>
          <div className="w-3/4 mb-6">
            <input
              type="password"
              name="password"
              id="password"
              className="w-full py-4 px-8 bg-slate-200 placeholder:font-semibold rounded hover:ring-1 outline-blue-500 "
              placeholder="Password"
              
            />
          </div>
          <div className="w-3/4 mb-6">
            <select
              name="role"
              id="role"
              className="w-full py-4 px-8 bg-slate-200 placeholder:font-semibold rounded hover:ring-1 outline-blue-500 "
              onChange={handleChange}
            >
              <option disabled value="">
                Select a role
              </option>
              <option value="employer">Employer</option>
              <option value="employee">Employee</option>
            </select>
          </div>

          <div className="w-3/4 flex flex-row justify-between"></div>
          <div className="w-3/4 mt-4">
            <button
              type="button"
              className="py-4 hover:bg-blue-400 w-full rounded text-blue-50 font-bold bg-blue-700"
             
            >
              SIGNUP
            </button>
          </div>
          <p className="flex flex-col items-center justify-center mt-10 text-center text-md text-gray-500">
            <span>Already have an account?</span>
            <Link
              to="/"
              className="text-indigo-400 hover:text-blue-500 no-underline hover:underline cursor-pointer transition ease-in duration-300"
            >
              Login
            </Link>
          </p>
        </div>
      </div>
    </div>
  );
};

export default SignUp;
