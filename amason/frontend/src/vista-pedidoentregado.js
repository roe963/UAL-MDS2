import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedidoentregado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="justify-content: space-between; align-items: center; width: 100%; padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s);border: 1px solid black;">
 <label id="lbl-pedido" style="align-self: center;">Label</label>
 <vaadin-button id="btn-ver-detalles-pedido" style="align-self: center;">
   Detalles 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-pedidoentregado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidoentregado.is, VistaPedidoentregado);
