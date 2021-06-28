import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedidoenviado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="justify-content: space-between; padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s); align-items: center; width: 100%;border: 1px solid black;">
 <label id="lbl-pedido" style="flex-grow: 0; align-self: center; flex-shrink: 1;">Label</label>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="btn-ver-detalles-pedido" style="flex-grow: 0; flex-shrink: 1;">
    Detalles 
  </vaadin-button>
  <vaadin-button id="btn-entregar-pedido" style="flex-shrink: 1; flex-grow: 0;">
   Entregado
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-pedidoenviado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidoenviado.is, VistaPedidoenviado);
