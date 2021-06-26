import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaTramitarpedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center;">
 <h4>Tramitar pedido</h4>
 <vaadin-vertical-layout id="layout-datoscompra" style="flex-shrink: 0; align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
 <vaadin-button id="button-comprar" style="align-self: center; margin: var(--lumo-space-m);">
   Comprar 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-tramitarpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTramitarpedido.is, VistaTramitarpedido);
