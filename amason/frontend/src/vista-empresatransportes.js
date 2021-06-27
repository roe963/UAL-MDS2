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
 <vaadin-horizontal-layout style="align-self: stretch; justify-content: space-between; margin-top: var(--lumo-space-m);">
  <vaadin-vertical-layout theme="spacing" id="layout-pedidos-enviados" style="flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-m);"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layout-pedidos-entregados" style="flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-m);"></vaadin-vertical-layout>
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
