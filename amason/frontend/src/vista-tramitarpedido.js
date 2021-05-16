import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-datosdecompra.js';

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
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout">
  <vista-datosdecompra id="vistaDatosdecompra"></vista-datosdecompra>
 </vaadin-vertical-layout>
 <vaadin-button id="button-comprar">
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
