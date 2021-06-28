import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

class VistaPedidosentregados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout id="layout-pedidos-entregados" style="width: 100%; align-items: stretch;"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidosentregados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosentregados.is, VistaPedidosentregados);
