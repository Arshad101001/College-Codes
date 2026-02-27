import React, {Component} from "react";

class LifeCycleDemo extends Component {
    constructor(props) {
        super(props);
        this.state= {count: 0};
        console.log('Constructor called');
    }
    componentDidMount(){
        console.log('component did mount');
    }
    componentDidUpdate(){
        console.log('Component did update');
    }
    componentWillUnmount(){
        console.log('component will unmount.');
    }
    incrementCount = () =>{
        this.setState({count: this.state.count + 1});
    };

    render(){
        console.log('Render method Called');
        return (
            <div>
                <h1>Lifecycle Method</h1>
                <p>Count: {this.state.count}</p>
                <button onClick={this.incrementCount}>Increament</button>
            </div>
        );
    }
}

export default LifeCycleDemo;