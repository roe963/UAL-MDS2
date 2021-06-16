import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productos.js';

class VistaProductoscliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vista-productos></vista-productos>
`;
    }

    static get is() {
        return 'vista-productoscliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoscliente.is, VistaProductoscliente);
