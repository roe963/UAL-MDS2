import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
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
<vaadin-horizontal-layout class="content" style="padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s); width: 100%; border: 1px solid black; justify-content: space-between;">
 <label id="lbl-pedido" style="align-self: center; flex-grow: 0; flex-shrink: 0; margin-right: var(--lumo-space-xl);">Label</label>
 <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; flex-grow: 0; width: 100%; flex-shrink: 1;">
  <vaadin-button id="btn-ver-detalles-pedido" style="align-self: center;">
    Detalles 
  </vaadin-button>
  <label style="margin-left: var(--lumo-space-xl); align-self: center;">Asignar</label>
  <vaadin-select value="Item one" id="select-empresa-transportes"></vaadin-select>
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
