import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-encargadosdecompras`
 *
 * VistaEncargadosdecompras element.
 *
 * @customElement
 * @polymer
 */
class VistaEncargadosdecompras extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-encargadosdecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadosdecompras.is, VistaEncargadosdecompras);
