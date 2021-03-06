import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productosdelcarrito.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVeepedidos extends PolymerElement {

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
 <vaadin-vertical-layout style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-m);">
  <h3 style="align-self: center; flex-shrink: 0;">Mis pedidos</h3>
  <vaadin-vertical-layout id="layout-mispedidos" style="flex-grow: 0; flex-shrink: 1; align-self: stretch;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-veepedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVeepedidos.is, VistaVeepedidos);
