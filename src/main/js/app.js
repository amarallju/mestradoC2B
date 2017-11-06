/**
 * 
 */
'use strict';
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {sales: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/sales'}).done(response => {
			this.setState({sales: response.entity._embedded.sales});
		});
	}

	render() {
		return (
			<SaleList sales={this.state.sales}/>
		)
	}
}

class SaleList extends React.Component{
	render() {
		var sales = this.props.sales.map(sale =>
			<Sale key={sale._links.self.href} sale={sale}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Título</th>
						<th>Descrição</th>
						<th>Preço</th>
						<th>Status</th>
					</tr>
					{sales}
				</tbody>
			</table>
		)
	}
}

class Sale extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.sale.title}</td>
				<td>{this.props.sale.description}</td>
				<td>{this.props.sale.price}</td>
				<td>{this.props.sale.status}</td>
			</tr>
		)
	}
}

ReactDOM.render(
		<App />,
		document.getElementById('react')
	)
