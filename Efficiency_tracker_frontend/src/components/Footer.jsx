import React from "react";
import { Link } from "react-router-dom";

const Footer = () => {
  return (
<<<<<<< HEAD
    <footer className="shadow bg-blue-800 ">
      <div className="w-full mx-auto container md:p-6 p-4 md:flex md:items-center md:justify-between">
        <span className="text-sm text-white sm:text-center ">
          © 2024{" "}
          <Link to="/dashboard" className="hover:underline">
            Task Magnet Pro
          </Link>
          . All Rights Reserved.
        </span>
        <ul className="flex flex-wrap items-center mt-3 text-sm text-gray-500 dark:text-gray-400 sm:mt-0">
          <li>
            <Link to="/about" className="mr-4 hover:underline md:mr-6 ">
              About
=======
    <footer className="bg-gray-900 text-white py-6">
      <div className="container mx-auto px-4">
        <div className="flex flex-col md:flex-row md:justify-between md:items-center">
          <div className="md:mb-0">
            <Link
              to="/dashboard"
              className="text-xl font-bold hover:text-gray-300"
            >
              Efficiency Tracker
>>>>>>> 2bdf1128ec0d41b521549ba790cd422c70831566
            </Link>
            <p className="text-sm mt-1">Revolutionizing remote work</p>
          </div>
          <ul className="flex flex-wrap text-sm mt-4 md:mt-0 md:ml-auto">
            <li className="mr-6 mb-2 md:mb-0">
              <Link to="/about" className="hover:text-gray-300">
                About
              </Link>
            </li>
            <li className="mr-6 mb-2 md:mb-0">
              <Link to="/privacy_policy" className="hover:text-gray-300">
                Privacy Policy
              </Link>
            </li>
            <li className="mr-6 mb-2 md:mb-0">
              <Link to="/licensing" className="hover:text-gray-300">
                Licensing
              </Link>
            </li>
            <li>
              <Link to="/contact" className="hover:text-gray-300">
                Contact
              </Link>
            </li>
          </ul>
        </div>
        <div className="text-sm mt-3 text-gray-500">
          © 2023 Efficiency Tracker. All Rights Reserved.
        </div>
      </div>
    </footer>
  );
};

export default Footer;
