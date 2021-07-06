import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

class VistaCategoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="justify-content: space-around; border: 1px solid black; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);" id="layout-categoria">
 <label id="label-categoria" style="flex-grow: 0; flex-shrink: 0; width: 90%;">Label</label>
 <vaadin-checkbox id="checkbox-activar" style="flex-grow: 0; width: 10%; flex-shrink: 0;">
   🔏 
 </vaadin-checkbox>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-categoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategoria.is, VistaCategoria);
