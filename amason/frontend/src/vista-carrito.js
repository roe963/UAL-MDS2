import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productosdelcarrito.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;">
 <vaadin-vertical-layout theme="spacing" id="layout-carrito" style="padding: var(--lumo-space-xl);">
  <h4>Carrito</h4>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <label style="align-self: center; flex-grow: 0;">Precio Total</label>
   <h4 style="align-self: center; flex-grow: 1;" id="h4">0,00 </h4>
   <vaadin-button style="flex-grow: 0; flex-shrink: 1; align-self: center;" id="vaadinButton">
     Tramitar pedido 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="vlProductos" style="width: 100%;">
   <vista-productosdelcarrito style="align-self: stretch; flex-grow: 1; flex-shrink: 1; padding: var(--lumo-space-xl);"></vista-productosdelcarrito>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-carrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCarrito.is, VistaCarrito);
