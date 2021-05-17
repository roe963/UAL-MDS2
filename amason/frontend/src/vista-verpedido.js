import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productosdelcarrito.js';
import './vista-productosdelpedido.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <h4 style="padding: var(--lumo-space-xl); padding-bottom: var(--lumo-space-xs);">Heading 4</h4>
 <vaadin-vertical-layout theme="spacing" style="padding-top: var(--lumo-space-xs); margin: var(--lumo-space-xl); align-self: stretch; margin-top: var(--lumo-space-xs); flex-grow: 1;">
  <vaadin-horizontal-layout theme="spacing">
   <h4>Heading 4</h4>
   <label style="align-self: center;">Label</label>
   <h4>Heading 4</h4>
   <label style="align-self: center;">Label</label>
   <h4>Heading 4</h4>
   <label style="align-self: center;">Label</label>
   <h4>Heading 4</h4>
   <label style="align-self: center;">Label</label>
   <h4>Heading 4</h4>
   <label style="align-self: center;">Label</label>
  </vaadin-horizontal-layout>
  <vista-productosdelpedido style="flex-grow: 0;"></vista-productosdelpedido>
  <vaadin-button id="button-cancelarcompra" style="align-self: center;">
    Cancelar compra 
  </vaadin-button>
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
