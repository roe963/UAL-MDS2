import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaProductodelpedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="margin-left: var(--lumo-space-s); margin-right: var(--lumo-space-s); justify-content: space-evenly;" theme="spacing-xl">
 <img style="min-width: 100px; min-height: 100px; padding: var(--lumo-space-s); flex-grow: 1; flex-shrink: 1; align-self: center; max-width: 100px; max-height: 100px;" id="img-producto-pedido">
 <vaadin-vertical-layout style="flex-shrink: 0; flex-grow: 1; align-items: flex-start;">
  <h4 id="h-nombre-producto-pedido" style="flex-grow: 0; flex-shrink: 0;">Producto</h4>
  <label id="lbl-categoria-producto-pedido" style="flex-shrink: 0;">Categoría</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="flex-grow: 1; justify-content: flex-start; align-self: center;">
  <label style="flex-grow: 0; align-self: center; margin-right: var(--lumo-space-s);" id="lbl-cantidad-producto-pedido">Uds.</label>
  <label style="flex-grow: 0; align-self: center; margin-right: var(--lumo-space-s);">x</label>
  <label style="flex-grow: 0; align-self: center; margin-right: var(--lumo-space-s);" id="lbl-precio-producto-pedido">Precio</label>
  <label style="flex-grow: 0; align-self: center; margin: var(--lumo-space-s);">=</label>
  <h4 id="h-preciototal-producto-pedido" style="align-self: center;">0,00€</h4>
 </vaadin-horizontal-layout>
 <vaadin-button id="button-valorar-producto-pedido" style="flex-grow: 0; align-self: center; flex-shrink: 1;">
   Valorar 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productodelpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductodelpedido.is, VistaProductodelpedido);
