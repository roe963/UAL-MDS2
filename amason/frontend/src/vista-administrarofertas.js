import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaAdministrarofertas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
<vaadin-vertical-layout style="width: 100%; align-items: center;">
 <h3 style="margin-left: var(--lumo-space-xl);">Administrar ofertas</h3>
</vaadin-vertical-layout>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 85%; justify-content: space-around;">
 <vaadin-vertical-layout id="layout-anadirOferta" style="width: 50%; height: 100%; flex-grow: 0; border: 1px solid black; flex-shrink: 1; margin: var(--lumo-space-s); align-items: stretch;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 50%; height: 100%; align-items: stretch; flex-grow: 0; border: 1px solid black; margin: var(--lumo-space-s);">
  <h4 style="margin-top: var(--lumo-space-l); margin-bottom: var(--lumo-space-xs); align-self: center;">Ofertas Activos/Desactivos</h4>
  <vaadin-vertical-layout id="layout-ofertas" style="align-self: stretch; align-items: stretch;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-administrarofertas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarofertas.is, VistaAdministrarofertas);
