import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaVerinformacion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: stretch;">
 <h2 id="h-pedido" style="align-self: center;">Heading 2</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1; flex-shrink: 0;">
  <h4 style="align-self: center; width: 20%;">Cliente</h4>
  <label id="lbl-nombre-cliente" style="align-self: center; width: 80%;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1; flex-shrink: 0;">
  <h4 style="align-self: center; width: 20%;">Dirección</h4>
  <label id="lbl-direccion-entrega" style="align-self: center; width: 80%;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1; flex-shrink: 0;">
  <h4 style="align-self: center; width: 20%;">Fecha</h4>
  <label id="lbl-fecha-pedido" style="align-self: center; width: 80%;">Label</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verinformacion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerinformacion.is, VistaVerinformacion);
