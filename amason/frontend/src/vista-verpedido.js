import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productosdelcarrito.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaVerpedido extends PolymerElement {

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
 <vaadin-vertical-layout id="layout-menu" style="align-self: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-grow: 1; align-self: stretch; margin: var(--lumo-space-m);">
  <h3 style="flex-shrink: 0; align-self: center;" id="h-idpedido">Pedido X</h3>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: stretch; justify-content: space-between;">
   <vaadin-horizontal-layout theme="spacing-l" style="justify-content: flex-start; flex-grow: 1;">
    <h4>Fecha:</h4>
    <label style="align-self: center;" id="lbl-fecha-pedido">Label</label>
    <h4>Precio:</h4>
    <label style="align-self: center;" id="lbl-precio-pedido">Label</label>
    <h4>Estado:</h4>
    <label style="align-self: center;" id="label-estado-pedido">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-button id="button-cancelarcompra" style="align-self: center;">
     Cancelar compra 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout id="layout-productosdelpedido" style="flex-grow: 1; flex-shrink: 0; align-self: stretch;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerpedido.is, VistaVerpedido);
