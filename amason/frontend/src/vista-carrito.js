import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
 <vaadin-vertical-layout id="layout-menu" style="align-self: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 1; flex-grow: 1; align-self: stretch; margin: var(--lumo-space-l);">
  <h3 style="align-self: center; flex-shrink: 0;">Carrito</h3>
  <vaadin-horizontal-layout theme="spacing-xl" style="justify-content: space-between; flex-grow: 0; flex-shrink: 1; align-self: stretch;">
   <vaadin-horizontal-layout theme="spacing-l" style="align-self: stretch; flex-grow: 1;">
    <h4 style="flex-grow: 0;" id="h4">Precio total</h4>
    <label style="flex-grow: 0; align-self: center;" id="lbl-precio-carrito">Precio Total</label>
   </vaadin-horizontal-layout>
   <vaadin-button style="flex-grow: 0; flex-shrink: 1; align-self: center;" id="button-tramitarpedido">
     Tramitar pedido 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout id="layout-productosdelcarrito" style="flex-grow: 1; align-self: stretch; flex-shrink: 0; align-items: stretch;"></vaadin-vertical-layout>
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
