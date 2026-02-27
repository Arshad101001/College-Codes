import React from "react";

// Define a class component named 'MyclassComponent'

class MyclassComponent extends React.Component {
    // The render method is the only required method in a class component
    // It returns the JSX that defines the component's UI
    render() {
        return (
            <div>
                <h1>Hello from a class Component!</h1>
                <p>This is a demonstration of a basic class component in React.</p>
            </div>
        );
    }
}

// Export the component for use in other parts of the application
export default MyclassComponent;