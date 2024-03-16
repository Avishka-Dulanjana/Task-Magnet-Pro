// const PageHeader = ({ title }) => {
//     return (
//       <div className="bg-gray-200 py-4">
//         <div className="max-w-7xl mx-16 px-4 sm:px-6 lg:px-4">
//           <h1 className="text-3xl leading-6 font-bold text-black">{title}</h1>
//         </div>
//       </div>
//     );
//   };

//   export default PageHeader

import React from "react";

const PageHeader = ({ title }) => {
  return (
    <div className="relative bg-gradient-to-r from-purple-600 to-indigo-600 py-12">
      <div
        className="absolute inset-0 bg-opacity-50 bg-cover bg-center"
        style={{ backgroundImage: "url('/path/to/your/image.jpg')" }}
      ></div>
      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div className="text-center">
          <h1 className="text-4xl font-bold text-white">{title}</h1>{" "}
        </div>
      </div>
    </div>
  );
};

export default PageHeader;
