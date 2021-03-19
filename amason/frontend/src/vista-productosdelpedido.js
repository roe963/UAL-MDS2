import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-productodelpedido.js';

class VistaProductosdelpedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <vista-productodelpedido></vista-productodelpedido>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productosdelpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosdelpedido.is, VistaProductosdelpedido);
