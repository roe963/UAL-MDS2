import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; justify-content: flex-start; align-items: center; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);border: 1px solid black; ">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 20%;">
  <h5>Nº Pedido:</h5>
  <label id="label-npedido" style="align-self: center;">Pedido</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 20%;">
  <h5>Nº Articulos:</h5>
  <label style="align-self: center;" id="label-narticulos">Articulos</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 20%;">
  <h5>Fecha:</h5>
  <label style="align-self: center;" id="label-fecha">Fecha</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 20%;">
  <h5>Precio:</h5>
  <label style="align-self: center;" id="label-precio">Precio</label>
 </vaadin-horizontal-layout>
 <label style="align-self: center; color:red; flex-grow: 1; flex-shrink: 0; width: 10%;" id="label-estado">Estado</label>
 <vaadin-button id="tbn-ver-detallado" style="flex-grow: 0;">
   Detallado 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-pedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedido.is, VistaPedido);
