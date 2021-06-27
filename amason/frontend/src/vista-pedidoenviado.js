import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaPedidoenviado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="justify-content: space-between; padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s);">
 <label id="lbl-pedido" style="flex-grow: 1; align-self: center;">Label</label>
 <vaadin-button id="btn-ver-detalles-pedido">
  Detalles
 </vaadin-button>
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
