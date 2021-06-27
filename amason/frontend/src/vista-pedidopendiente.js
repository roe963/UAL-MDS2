import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedidopendiente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="justify-content: space-between; padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s);">
 <label id="lbl-pedido" style="align-self: center; flex-grow: 1; flex-shrink: 0;">Label</label>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="btn-ver-detalles-pedido" style="align-self: center;">
    Detalles 
  </vaadin-button>
  <vaadin-button id="btn-marcar-entregado" style="align-self: center;">
    Entregado 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-pedidopendiente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidopendiente.is, VistaPedidopendiente);
