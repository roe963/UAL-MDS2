import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productosdelcarrito.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedidoclienteregistrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
  <h5>Nº Pedido:</h5>
  <label id="label-npedido" style="align-self: center;">Pedido</label>
  <h5>Nº Articulos:</h5>
  <label style="align-self: center;" id="label-narticulos">Articulos</label>
  <h5>Fecha:</h5>
  <label style="align-self: center;" id="label-fecha">Fecha</label>
  <h5>Precio:</h5>
  <label style="align-self: center;" id="label-precio">Precio</label>
  <label style="align-self: center; color:red; flex-grow: 0;" id="label-estado">Estado</label>
  <vaadin-button style="align-self: center; flex-grow: 0;">
   Ver detalle
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidoclienteregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidoclienteregistrado.is, VistaPedidoclienteregistrado);
