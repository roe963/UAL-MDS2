import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 18%;">
 <vaadin-vertical-layout theme="spacing">
  <img style="padding: var(--lumo-space-xl);" id="img-pedido">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="padding-left: var(--lumo-space-xl);">
  <vaadin-list-box>
   <h4 id="h-pedido">Producto</h4>
   <label id="label-categoria">Categoría</label>
  </vaadin-list-box>
  <label id="label-cantidad">Cantidad</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; padding-left: var(--lumo-space-xl); align-self: flex-end;">
  <vaadin-button id="button-valorar" style="flex-grow: 0;">
   Valorar
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; padding-right: var(--lumo-space-xl);">
  <vaadin-list-box style="align-self: center;">
   <label style="flex-grow: 0;">Precio</label>
   <h4 id="h-precio">0,00€</h4>
  </vaadin-list-box>
 </vaadin-vertical-layout>
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
