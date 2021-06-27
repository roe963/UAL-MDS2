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
<vaadin-horizontal-layout class="content" style="margin-right: var(--lumo-space-l); margin-left: var(--lumo-space-l); justify-content: space-evenly;" theme="spacing-xl">
 <img style="padding: var(--lumo-space-s); min-width: 100px; max-width: 100px; min-height: 100px; flex-grow: 1; align-self: center; max-height: 100px;" id="img-producto-carrito">
 <vaadin-vertical-layout style="flex-grow: 1; flex-shrink: 0; align-items: flex-start;">
  <h4 id="h-nombre-producto-carrito">Producto</h4>
  <label id="lbl-categoria-producto-carrito" style="flex-grow: 0; flex-shrink: 1;">Categoría</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; align-self: center;">
  <label style="flex-grow: 0; align-self: center; flex-shrink: 0; margin-right: var(--lumo-space-s);">Cantidad</label>
  <vaadin-vertical-layout id="layout-selec-cantidad" style="margin-right: var(--lumo-space-s);"></vaadin-vertical-layout>
  <label style="flex-grow: 0; align-self: center; margin-right: var(--lumo-space-s);">x</label>
  <label style="flex-grow: 0; align-self: center; margin-right: var(--lumo-space-s);" id="lbl-precio-producto-carrito">Precio</label>
  <label style="flex-grow: 0; align-self: center; flex-shrink: 0; padding-right: var(--lumo-space-s);">=</label>
  <h4 id="h-preciototal-producto-carrito" style="flex-shrink: 0; align-self: center; padding-right: var(--lumo-space-s);">0,00€</h4>
 </vaadin-horizontal-layout>
 <vaadin-button id="button-eliminar-producto-carrito" style="flex-grow: 0; align-self: center;">
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
