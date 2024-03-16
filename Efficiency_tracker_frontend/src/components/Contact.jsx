import React from "react";
import {
  FaEnvelope,
  FaFacebook,
  FaInstagram,
  FaPhone,
  FaTiktok,
} from "react-icons/fa";

const Contact = () => {
  return (
    <div className="flex justify-center items-center h-screen bg-gradient-to-br from-blue-200 to-blue-500">
      <div className="bg-white rounded-lg shadow-md p-8 max-w-md w-full">
        <div className="text-center">
          <h2 className="text-3xl font-bold text-gray-900 mb-6">Contact Us</h2>
        </div>
        <ul className="space-y-4">
          <li className="flex items-center">
            <FaEnvelope className="w-6 h-6 mr-2 text-blue-600" />
            <a
              href="mailto:example@example.com"
              className="text-blue-600 hover:underline"
            >
              taskmagnetpro@gmaiil.com
            </a>
          </li>
          <li className="flex items-center">
            <FaFacebook className="w-6 h-6 mr-2 text-blue-600" />
            <a
              href="https://facebook.com/example"
              target="_blank"
              rel="noopener noreferrer"
              className="text-blue-600 hover:underline"
            >
              Task_Magnet_pro
            </a>
          </li>
          <li className="flex items-center">
            <FaInstagram className="w-6 h-6 mr-2 text-pink-600" />
            <a
              href="https://instagram.com/example"
              target="_blank"
              rel="noopener noreferrer"
              className="text-pink-600 hover:underline"
            >
              task_magnet_pro
            </a>
          </li>
          <li className="flex items-center">
            <FaTiktok className="w-6 h-6 mr-2 text-black" />
            <a
              href="https://tiktok.com/example"
              target="_blank"
              rel="noopener noreferrer"
              className="text-black hover:underline"
            >
              task_magnet_pro
            </a>
          </li>
          <li className="flex items-center">
            <FaPhone className="w-6 h-6 mr-2 text-green-600" />
            <a
              href="tel:+94717375526"
              className="text-green-600 hover:underline"
            >
              (071) 7375865
            </a>
          </li>
        </ul>
      </div>
    </div>
  );
};

export default Contact;
