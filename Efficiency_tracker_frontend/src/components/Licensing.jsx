import React from "react";

const Licensing = () => {
  return (
    <div className="bg-gradient-to-br from-blue-200 to-blue-500 py-12">
      <div className="max-w-3xl mx-auto px-4 sm:px-6 lg:px-8 bg-black bg-opacity-20 rounded-lg shadow-md py-8">
        <h2 className="text-4xl font-bold text-gray-900 mb-8">
          Licensing Information
        </h2>
        <p className="mt-4 text-lg text-gray-800 leading-relaxed">
          Task Magnet Pro software is licensed under the Apache License,
          Version 2.0.
        </p>
        <p className="mt-4 text-lg text-gray-800 leading-relaxed">
          This means that you can use, modify, distribute, and sublicense the
          software, as long as you comply with the terms of the license.
        </p>
        <p className="mt-4 text-lg text-gray-800 leading-relaxed">
          You can find the full text of the Apache License, Version 2.0 at the
          following link:{" "}
          <a
            href="https://www.apache.org/licenses/LICENSE-2.0"
            className="text-blue-600 hover:underline"
          >
            Apache License, Version 2.0
          </a>
          .
        </p>
        <p className="mt-4 text-lg text-gray-800 leading-relaxed">
          If you have any questions or concerns regarding our licensing, please
          contact us at licensing@taskpagnetpro.com.
        </p>
      </div>
    </div>
  );
};

export default Licensing;
