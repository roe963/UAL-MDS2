import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaPedidospendientes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout id="layout-pedidos-pendinetes" style="width: 100%; align-items: stretch;"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidospendientes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidospendientes.is, VistaPedidospendientes);
