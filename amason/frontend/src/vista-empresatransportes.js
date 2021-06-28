import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaEmpresatransportes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-header" style="align-self: center;"></vaadin-vertical-layout>
 <h1 style="align-self: center;">Empresa de transportes</h1>
 <label id="id-email-transportes" style="align-self: center;">Label</label>
 <vaadin-horizontal-layout style="align-self: stretch; justify-content: space-around; margin-top: var(--lumo-space-m); width: 100%; height: 90%;">
  <vaadin-vertical-layout style="flex-grow: 0; width: 40%; height: 95%;">
   <h4 style="align-self: center;">Pedidos enviados</h4>
   <vaadin-vertical-layout id="layout-pedidos-enviados" style="flex-grow: 0; flex-shrink: 1; width: 100%; height: 100%; border: 1px solid black; align-items: stretch;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-grow: 0; width: 40%; height: 95%;">
   <h4 style="align-self: center;">Pedidos entregados</h4>
   <vaadin-vertical-layout id="layout-pedidos-entregados" style="flex-grow: 0; flex-shrink: 1; width: 100%; height: 100%; border: 1px solid black; align-items: stretch;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-empresatransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresatransportes.is, VistaEmpresatransportes);
