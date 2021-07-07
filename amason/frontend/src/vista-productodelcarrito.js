import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaProductodelcarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="margin-left: var(--lumo-space-xs); justify-content: center; margin-right: var(--lumo-space-xs); border: 1px solid black;" theme="spacing-xl">
 <img style="padding: var(--lumo-space-s); min-width: 100px; max-width: 100px; min-height: 100px; flex-grow: 1; align-self: center; max-height: 100px; width: 15%;" id="img-producto-carrito">
 <vaadin-vertical-layout style="flex-grow: 1; flex-shrink: 0; align-items: flex-start; width: 30%;">
  <h4 id="h-nombre-producto-carrito">Producto</h4>
  <label id="lbl-categoria-producto-carrito" style="flex-grow: 0; flex-shrink: 1;">Categoría</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="flex-grow: 0; flex-shrink: 1; align-self: center; justify-content: center;">
  <label style="flex-grow: 0; align-self: center; flex-shrink: 0; margin-right: var(--lumo-space-s);">Cantidad</label>
  <vaadin-vertical-layout id="layout-selec-cantidad" style="flex-shrink: 1; align-items: baseline;"></vaadin-vertical-layout>
  <label style="flex-grow: 0; align-self: center; margin-right: var(--lumo-space-s);">x</label>
  <label style="flex-grow: 0; align-self: center; margin-right: var(--lumo-space-s);" id="lbl-precio-producto-carrito">Precio</label>
  <label style="flex-grow: 0; align-self: center; flex-shrink: 0; padding-right: var(--lumo-space-s);">=</label>
  <h4 id="h-preciototal-producto-carrito" style="flex-shrink: 0; align-self: center; padding-right: var(--lumo-space-s);">0,00€</h4>
 </vaadin-horizontal-layout>
 <vaadin-button id="button-eliminar-producto-carrito" style="flex-grow: 0; align-self: center; width: 10%; margin-right: var(--lumo-space-m);">
   Eliminar 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productodelcarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductodelcarrito.is, VistaProductodelcarrito);
