import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productosdelcarrito.js';
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
<vaadin-horizontal-layout style="align-self: stretch; justify-content: space-evenly; margin-left: var(--lumo-space-xs); margin-right: var(--lumo-space-xs); border: 1px solid black; padding-left: var(--lumo-space-s); padding-right: var(--lumo-space-s); width: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 15%;">
  <h5>Nº Pedido:</h5>
  <label id="label-npedido" style="align-self: center;">Pedido</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 15%;">
  <h5>Nº Articulos:</h5>
  <label style="align-self: center;" id="label-narticulos">Articulos</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 15%;">
  <h5>Fecha:</h5>
  <label style="align-self: center;" id="label-fecha">Fecha</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 15%;">
  <h5>Precio:</h5>
  <label style="align-self: center;" id="label-precio">Precio</label>
 </vaadin-horizontal-layout>
 <label style="align-self: center; color:red; flex-grow: 0; flex-shrink: 1; width: 10%;" id="label-estado">Estado</label>
 <vaadin-button style="align-self: center; flex-grow: 0; width: 10%;" id="vaadinButton">
   Ver detalle 
 </vaadin-button>
</vaadin-horizontal-layout>
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
